package com.ppamorim.mocky.model;

import com.ppamorim.library.MockyClass;
import com.ppamorim.library.MockyValue;

@MockyClass
public class Android {

  @MockyValue(field = "name") String name;

  public Android(@MockyValue(field = "name") String name) {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
