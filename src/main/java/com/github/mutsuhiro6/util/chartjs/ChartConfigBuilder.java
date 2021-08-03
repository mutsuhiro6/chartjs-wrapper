package com.github.mutsuhiro6.util.chartjs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ChartConfigBuilder {

  private static ObjectMapper mapper = new ObjectMapper();

  @SuppressWarnings("unchecked")
  public static Map<String, Object> buildConfigMap(ChartConfig config) {
    mapper.setSerializationInclusion(Include.NON_DEFAULT);
    return mapper.convertValue(config, HashMap.class);
  }

}
