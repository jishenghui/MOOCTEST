package net.mooctest;

public class TooLongPathException extends RuntimeException {

  TooLongPathException(String errMsg) {
    super(errMsg);
  }
}
