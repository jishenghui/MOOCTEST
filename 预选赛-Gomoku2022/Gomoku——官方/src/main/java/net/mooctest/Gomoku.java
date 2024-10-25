package net.mooctest;

import java.util.ArrayList;
import java.util.List;

public class Gomoku {
    public final static int AI = 1;
    public final static int PLAYER = 2;
    public final static int BLANK = 0;
    private final static int WIN = 0;
    private final static int HUO4 = 1;
    private final static int CHONG4 = 2;
    private final static int HUO3 = 3;
    private final static int MIAN3 = 4;
    private final static int HUO2 = 5;
    private final static int MIAN2 = 6;
    private final static int OL1 = 7;
    private final static int NONE = 8;
    private final static String[] WIN_AI = {"11111"};
    private final static String[] WIN_PLAYER = {"22222"};
    private final static String[] HUO4_AI = {"011110"};
    private final static String[] HUO4_PLAYER = {"022220"};
    private final static String[] CHONG4_AI = {"011112", "211110", "10111", "11011", "11101"};
    private final static String[] CHONG4_PLAYER = {"022221", "122220", "20222", "22022", "22202"};
    private final static String[] HUO3_AI = {"001110", "011100", "010110", "011010"};
    private final static String[] HUO3_PLAYER = {"002220", "022200", "020220", "022020"};
    private final static String[] MIAN3_AI = {"001112", "010112", "011012", "011102", "211100", "211010", "210110", "201110", "00111", "10011", "10101", "10110", "01011", "10011", "11001", "11010", "01101", "10101", "11001", "11100",};
    private final static String[] MIAN3_PLAYER = {"002221", "020221", "022021", "022201", "122200", "122020", "120220", "102220", "00222", "20022", "20202", "20220", "02022", "20022", "22002", "22020", "02202", "20202", "22002", "22200",};
    private final static String[] HUO2_AI = {"000110", "001010", "001100", "001100", "010100", "011000", "000110", "010010", "010100", "001010", "010010", "011000",};
    private final static String[] HUO2_PLAYER = {"000220", "002020", "002200", "002200", "020200", "022000", "000220", "020020", "020200", "002020", "020020", "022000",};
    private final static String[] MIAN2_AI = {"000112", "001012", "010012", "10001", "2010102", "2011002", "211000", "210100", "210010", "2001102"};
    private final static String[] MIAN2_PLAYER = {"000221", "002021", "020021", "20002", "1020201", "1022001", "122000", "120200", "120020", "1002201"};
    private final static String[] OL1_AI = {"1"};
    private final static String[] OL1_PLAYER = {"2"};
    private final static String[] NONE_ = {""};
 
    private final static int BOARD_SIZE = 15;
  
    private static int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
    private static int[][] scoreMatrix = new int[BOARD_SIZE][BOARD_SIZE];
    private static final int INFINITY = 1000000000;


    public static int alphaBeta(Node node, int alpha, int beta, int depth) {
        if (checkSituation(node.p, getString(node.x, node.y), WIN)) {
            if (node.p == AI) {
                return INFINITY;
            } else {
                return -INFINITY;
            }
        }
        if (depth == 0) {
            return computeScore();
        }
        if (node.p == AI) {
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    if (isValid(i, j)) {
                        board[i][j] = node.p;
                        Node child = new Node(node);
                        child.x = i;
                        child.y = j;
                        int val = alphaBeta(child, alpha, beta, depth - 1);
                        board[i][j] = BLANK;
                        if (val > alpha) {
                            alpha = val;
                            scoreMatrix[i][j] = alpha;
                        }
                        if (alpha >= beta) {
                            break;
                        }
                    }
                }
                if (alpha >= beta) {
                    break;
                }
            }
            return alpha;
        } else {
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    if (isValid(i, j)) {
                        board[i][j] = node.p;
                        Node child = new Node(node);
                        child.x = i;
                        child.y = j;
                        int val = alphaBeta(child, alpha, beta, depth - 1);
                        board[i][j] = BLANK;
                        if (val < beta) {
                            beta = val;
                            scoreMatrix[i][j] = beta;
                        }
                        if (alpha >= beta) {
                            break;
                        }
                    }
                }
                if (alpha >= beta) {
                    break;
                }
            }
            return beta;
        }
    }

    public static Node getBestStep(List<Node> nodes) {
        Node node = nodes.get(0);
        board[node.x][node.y] = node.p;
        int v = computeScore();
        board[node.x][node.y] = BLANK;
        int index = 0;
        for (int i = 0; i < nodes.size(); i++) {
            Node n = nodes.get(i);
            board[n.x][n.y] = n.p;
            int v1 = computeScore();
            if (v1 > v) {
                index = i;
            }
            board[n.x][n.y] = BLANK;
        }
        node = nodes.get(index);
        return node;
    }

    public static int computeScore() {
        int score = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] != BLANK) {
                    List<String> list = getString(i, j);
                    if (checkSituation(AI, list, WIN)) {
                        score += 100000000;
                    }
                    if (checkSituation(PLAYER, list, WIN)) {
                        score += -100000000;
                    }
                    if (checkSituation(AI, list, HUO4)) {
                        score += 10000000;
                    }
                    if (checkSituation(PLAYER, list, HUO4)) {
                        score += -10000000;
                    }
                    if (checkSituation(AI, list, CHONG4)) {
                        score += 1000000;
                    }
                    if (checkSituation(PLAYER, list, CHONG4)) {
                        score += -1000000;
                    }
                    if (checkSituation(AI, list, HUO3)) {
                        score += 100000;
                    }
                    if (checkSituation(PLAYER, list, HUO3)) {
                        score += -100000;
                    }
                    if (checkSituation(AI, list, MIAN3)) {
                        score += 10000;
                    }
                    if (checkSituation(PLAYER, list, MIAN3)) {
                        score += -10000;
                    }
                    if (checkSituation(AI, list, HUO2)) {
                        score += 1000;
                    }
                    if (checkSituation(PLAYER, list, HUO2)) {
                        score += -1000;
                    }
                    if (checkSituation(AI, list, MIAN2)) {
                        score += 100;
                    }
                    if (checkSituation(PLAYER, list, MIAN2)) {
                        score += -100;
                    }
                    if (checkSituation(AI, list, OL1)) {
                        score += 10;
                    }
                    if (checkSituation(PLAYER, list, OL1)) {
                        score += -10;
                    }
                    if (checkSituation(AI, list, NONE)) {
                        score += 1;
                    }
                    if (checkSituation(PLAYER, list, NONE)) {
                        score += -1;
                    }
                }
            }
        }
        return score;
    }

    public static boolean checkSituation(int p, List<String> list, int type) {
        switch (type) {
            case WIN:
                if (p == AI) {
                    if (checkString(list, WIN_AI)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, WIN_PLAYER)) {
                        return true;
                    }
                }
                return false;
            case HUO4:
                if (p == AI) {
                    if (checkString(list, HUO4_AI)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, HUO4_PLAYER)) {
                        return true;
                    }
                }
                return false;
            case CHONG4:
                if (p == AI) {
                    if (checkString(list, CHONG4_AI)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, CHONG4_PLAYER)) {
                        return true;
                    }
                }
                return false;
            case HUO3:
                if (p == AI) {
                    if (checkString(list, HUO3_AI)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, HUO3_PLAYER)) {
                        return true;
                    }
                }
                return false;
            case MIAN3:
                if (p == AI) {
                    if (checkString(list, MIAN3_AI)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, MIAN3_PLAYER)) {
                        return true;
                    }
                }
                return false;
            case HUO2:
                if (p == AI) {
                    if (checkString(list, HUO2_AI)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, HUO2_PLAYER)) {
                        return true;
                    }
                }
                return false;
            case MIAN2:
                if (p == AI) {
                    if (checkString(list, MIAN2_AI)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, MIAN2_PLAYER)) {
                        return true;
                    }
                }
                return false;
            case OL1:
                if (p == AI) {
                    if (checkString(list, OL1_AI)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, OL1_PLAYER)) {
                        return true;
                    }
                }
                return false;
            case NONE:
                if (p == AI) {
                    if (checkString(list, NONE_)) {
                        return true;
                    }
                } else if (p == PLAYER) {
                    if (checkString(list, NONE_)) {
                        return true;
                    }
                }
                return false;
        }
        return true;
    }

    public static boolean checkString(List<String> list, String[] situation) {
        for (String str : list) {
            for (int i = 0; i < situation.length; i++) {
                if (str.contains(situation[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> getString(int x, int y) {
        List<String> strings = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0, j = y; i < BOARD_SIZE; i++) {
            sb.append(board[i][j]);
        }
        strings.add(sb.toString());
        sb.delete(0, sb.length());
        for (int i = x, j = 0; j < BOARD_SIZE; j++) {
            sb.append(board[i][j]);
        }
        strings.add(sb.toString());
        sb.delete(0, sb.length());
       
        if (x + y < BOARD_SIZE) { 
            for (int i = 0, j = x + y; i < BOARD_SIZE && j >= 0; i++, j--) {
                sb.append(board[i][j]);
            }
        } else {
            for (int i = x + y - 7, j = BOARD_SIZE - 1; i < BOARD_SIZE && j >= 0; i++, j--) {
                sb.append(board[i][j]);
            }
        }
        strings.add(sb.toString());
        sb.delete(0, sb.length());
      
        if (x <= y) {
            for (int i = 0, j = y - x; i < BOARD_SIZE && j < BOARD_SIZE; i++, j++) {  // 棋盘上三角
                sb.append(board[i][j]);
            }
        } else {
            for (int i = x - y, j = 0; i < BOARD_SIZE && j < BOARD_SIZE; i++, j++) {  // 棋盘下三角
                sb.append(board[i][j]);
            }
        }
        strings.add(sb.toString());
        sb.delete(0, sb.length());
        return strings;
    }

    public static void initBoard() {
        board[7][7] = PLAYER;
        board[7][6] = AI;
        board[8][6] = PLAYER;
        board[8][5] = AI;
        board[8][7] = PLAYER;
        board[9][5] = AI;
        board[9][6] = PLAYER;
        board[7][5] = AI;
        board[10][5] = PLAYER;
        board[7][8] = AI;
        board[8][8] = PLAYER;
        board[8][9] = AI;
        board[6][7] = PLAYER;
        board[9][7] = AI;
        board[6][6] = PLAYER;
        board[9][9] = AI;
        board[10][6] = PLAYER;
        board[11][6] = AI;
        board[10][7] = PLAYER;
        board[10][4] = AI;
        board[6][8] = PLAYER;
    }

    public static boolean isValid(int x, int y) {
        if (board[x][y] != BLANK) {
            return false;
        }
        if (x == 0) {
            if (y == 0) {
                if (board[x + 1][y] == BLANK && board[x][y + 1] == BLANK && board[x + 1][y + 1] == BLANK) {
                    return false;
                }
            } else if (y == BOARD_SIZE - 1) {
                if (board[x + 1][y] == BLANK && board[x][y - 1] == BLANK && board[x + 1][y - 1] == BLANK) {
                    return false;
                }
            } else {
                if (board[x][y + 1] == BLANK && board[x][y - 1] == BLANK && board[x + 1][y + 1] == BLANK && board[x + 1][y - 1] == BLANK && board[x + 1][y] == BLANK) {
                    return false;
                }
            }
        } else if (y == 0) {
            if (x == 0) {
                if (board[x + 1][y] == BLANK && board[x][y + 1] == BLANK && board[x + 1][y + 1] == BLANK) {
                    return false;
                }
            } else if (x == BOARD_SIZE - 1) {
                if (board[x - 1][y] == BLANK && board[x][y + 1] == BLANK && board[x - 1][y + 1] == BLANK) {
                    return false;
                }
            } else {
                if (board[x + 1][y] == BLANK && board[x - 1][y] == BLANK && board[x + 1][y + 1] == BLANK && board[x - 1][y + 1] == BLANK && board[x][y + 1] == BLANK) {
                    return false;
                }
            }
        } else if (x == BOARD_SIZE - 1) {
            if (y == 0) {
                if (board[x - 1][y] == BLANK && board[x][y + 1] == BLANK && board[x - 1][y + 1] == BLANK) {
                    return false;
                }
            } else if (y == BOARD_SIZE - 1) {
                if (board[x][y - 1] == BLANK && board[x - 1][y] == BLANK && board[x - 1][y - 1] == BLANK) {
                    return false;
                }
            } else {
                if (board[x][y + 1] == BLANK && board[x][y - 1] == BLANK && board[x - 1][y + 1] == BLANK && board[x - 1][y - 1] == BLANK && board[x - 1][y] == BLANK) {
                    return false;
                }
            }
        } else if (y == BOARD_SIZE - 1) {
            if (x == 0) {
                if (board[x][y - 1] == BLANK && board[x + 1][y] == BLANK && board[x + 1][y - 1] == BLANK) {
                    return false;
                }
            } else if (x == BOARD_SIZE - 1) {
                if (board[x - 1][y] == BLANK && board[x][y - 1] == BLANK && board[x - 1][y - 1] == BLANK) {
                    return false;
                }
            } else {
                if (board[x - 1][y] == BLANK && board[x + 1][y] == BLANK && board[x][y - 1] == BLANK && board[x - 1][y - 1] == BLANK && board[x + 1][y - 1] == BLANK) {
                    return false;
                }
            }
        } else {
            if (board[x - 1][y - 1] == BLANK && board[x - 1][y] == BLANK && board[x - 1][y + 1] == BLANK && board[x][y - 1] == BLANK && board[x][y + 1] == BLANK
                    && board[x + 1][y - 1] == BLANK && board[x + 1][y] == BLANK && board[x + 1][y + 1] == BLANK) {
                return false;
            }
        }
        return true;
    }


    public static void showScore() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                for (int m = 0; m < BOARD_SIZE; m++) {
                    for (int n = 0; n < BOARD_SIZE; n++) {
                        if (board[m][n] != 0) {
                            scoreMatrix[m][n] = board[m][n];
                        }
                    }
                }
            }
        }
    }
}