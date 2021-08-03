package com.github.mutsuhiro6.util.chartjs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BorderRadius<T> {
  private final T borderRadius;

  public static enum BorderRadiusProperty {
    outerStart, outerEnd, innerStart, innerEnd,;
  }

  @Getter
  @AllArgsConstructor
  public static class BorderRadiusProperties {

    private final double topLeft;

    private final double topRight;

    private final double bottomLeft;

    private final double bottomRight;

  }
}
