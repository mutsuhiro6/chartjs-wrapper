package com.github.mutsuhiro6.util.chartjs;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChartConfig {

  private ChartTypes type;

  private Data data;

  private Options options;

  public ChartConfig(ChartTypes type, Data data) {
    this.type = type;
    this.data = data;
  }
}
