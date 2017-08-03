/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class picker_flags_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected picker_flags_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(picker_flags_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_picker_flags_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public picker_flags_t all() {
    return new picker_flags_t(libtorrent_jni.picker_flags_t_all(swigCPtr, this), true);
  }

  public boolean op_bool() {
    return libtorrent_jni.picker_flags_t_op_bool(swigCPtr, this);
  }

  public boolean op_eq(picker_flags_t f) {
    return libtorrent_jni.picker_flags_t_op_eq(swigCPtr, this, picker_flags_t.getCPtr(f), f);
  }

  public boolean op_ne(picker_flags_t f) {
    return libtorrent_jni.picker_flags_t_op_ne(swigCPtr, this, picker_flags_t.getCPtr(f), f);
  }

  public static picker_flags_t op_or(picker_flags_t lhs, picker_flags_t rhs) {
    return new picker_flags_t(libtorrent_jni.picker_flags_t_op_or(picker_flags_t.getCPtr(lhs), lhs, picker_flags_t.getCPtr(rhs), rhs), true);
  }

  public static picker_flags_t op_and(picker_flags_t lhs, picker_flags_t rhs) {
    return new picker_flags_t(libtorrent_jni.picker_flags_t_op_and(picker_flags_t.getCPtr(lhs), lhs, picker_flags_t.getCPtr(rhs), rhs), true);
  }

  public static picker_flags_t op_xor(picker_flags_t lhs, picker_flags_t rhs) {
    return new picker_flags_t(libtorrent_jni.picker_flags_t_op_xor(picker_flags_t.getCPtr(lhs), lhs, picker_flags_t.getCPtr(rhs), rhs), true);
  }

  public picker_flags_t op_inv() {
    return new picker_flags_t(libtorrent_jni.picker_flags_t_op_inv(swigCPtr, this), true);
  }

  public int to_int() {
    return libtorrent_jni.picker_flags_t_to_int(swigCPtr, this);
  }

  public picker_flags_t() {
    this(libtorrent_jni.new_picker_flags_t(), true);
  }

}
