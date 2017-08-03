/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class tracker_alert extends torrent_alert {
  private transient long swigCPtr;

  protected tracker_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.tracker_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(tracker_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_tracker_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public alert_category_t category() {
    return new alert_category_t(libtorrent_jni.tracker_alert_category(swigCPtr, this), true);
  }

  public String message() {
    return libtorrent_jni.tracker_alert_message(swigCPtr, this);
  }

  public String tracker_url() {
    return libtorrent_jni.tracker_alert_tracker_url(swigCPtr, this);
  }

  public final static int alert_type = libtorrent_jni.tracker_alert_alert_type_get();
  public final static alert_category_t static_category = new alert_category_t(libtorrent_jni.tracker_alert_static_category_get(), false);
}
