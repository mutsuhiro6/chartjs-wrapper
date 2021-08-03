package com.github.mutsuhiro6.util.chartjs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Fill<T> {
  public final T fill;

  public static enum Boundary {
    start, end, origin,;
  }

  public static enum StackedValueBelow {
    stack,;
  }

  @Data
  public static class AxisValue {
    private double value;
  }
}
