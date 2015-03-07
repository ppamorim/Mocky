/*
 * Copyright (C) 2015 Pedro Paulo de Amorim.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ppamorim.library;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Return a instance of a new paramerized list
 *
 * @author Pedro Paulo de Amorim.
 */
public final class Mocky {

  //public T object(T type) {
  //
  //}

  @SuppressWarnings("unchecked")
  public static <T> ArrayList arrayList(Class input, int size) throws Exception {
    ArrayList<T> arrayList = new ArrayList<>(size);
    for(int i = 0; i < size; i++) {
      arrayList.add((new Foo<T>(input)).createInstance());
    }
    return arrayList;
  }

  //public List<T> list(T type, int size) {
  //  List<T> list = new ArrayList<>(size);
  //  for(int i = 0; i < size; i++) {
  //    list.add(type);
  //  }
  //  return list;
  //}
  //
  //public Vector<T> vector(T type, int size) {
  //  Vector<T> list = new Vector<>(size);
  //  for(int i = 0; i < size; i++) {
  //    list.add(type);
  //  }
  //  return list;
  //}

  public static class Foo<T> {
    private Class<T> type;
    public Foo(Class<T> type) {
      this.type = type;
    }
    public T createInstance() throws Exception {
      return type.newInstance();
    }
  }





}
