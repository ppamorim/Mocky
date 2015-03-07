package com.ppamorim.mocky.model;

import com.ppamorim.library.MockyClass;
import com.ppamorim.library.MockyValue;

@MockyClass
public class Android {

  @MockyValue(value = "name") String name;

  public Android(@MockyValue(value = "name") String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
