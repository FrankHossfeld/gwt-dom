/*
 * Copyright © 2019 The GWT Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.dom.client;

import java.util.Locale;
import jsinterop.annotations.*;
import jsinterop.base.Js;
import org.gwtproject.core.client.JavaScriptObject;

/**
 * Class representing DataTransfer interface.
 *
 * <p><span style="color:red">Experimental API: This API is still under development and is subject
 * to change. </span>
 *
 * @see <a href="http://www.w3.org/TR/html5/dnd.html#the-datatransfer-interface">W3C HTML
 *     Specification</a>
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DataTransfer extends JavaScriptObject {

  /** Required constructor for GWT compiler to function. */
  protected DataTransfer() {}

  /**
   * Remove all data from the current drag sequence.
   *
   * @see <a href="http://www.w3.org/TR/html5/dnd.html#dom-datatransfer-cleardata">W3C
   *     Specification</a>
   */
  public final native void clearData();

  /**
   * Remove the data for the specified format for all drag events in the current drag sequence.
   *
   * @param format the format, which is usually the mime-type of the associated data
   * @see #setData(String, String)
   * @see <a href="http://www.w3.org/TR/html5/dnd.html#dom-datatransfer-cleardata">W3C
   *     Specification</a>
   */
  public final native void clearData(String format);

  /**
   * Get the data for the specified format. The data may have been set in a previous drag event that
   * is part of the current drag sequence.
   *
   * @param format the format, which is usually the mime-type of the data
   * @return the data for the specified format
   * @see #setData(String, String)
   * @see <a href="http://www.w3.org/TR/html5/dnd.html#dom-datatransfer-getdata">W3C
   *     Specification</a>
   */
  public final native String getData(String format);

  /**
   * Set the data for the specified format to associate with all drag events in the current drag and
   * drop sequence. The data can be read using {@link #getData(String)} from any subsequent drag
   * events in this sequence (such as the drop event).
   *
   * <p>The format is usually the mime-type of the data, but can also be <code>text</code>.
   *
   * @param format the format, which is usually the mime-type of the data
   * @param data the data to associate with the format
   * @see <a href="http://www.w3.org/TR/html5/dnd.html#dom-datatransfer-setdata">W3C
   *     Specification</a>
   */
  public final native void setData(String format, String data);

  /**
   * Specify the element to use to update the drag feedback.
   *
   * @param element the feedback image
   * @param x the x offset of the cursor
   * @param y the y offset of the cursor
   * @see <a href="http://www.w3.org/TR/html5/dnd.html#dom-datatransfer-setdragimage">W3C
   *     Specification</a>
   */
  @JsOverlay
  public final void setDragImage(Element element, int x, int y) {
    if (this.getSetDragImage() != null) {
      this.callSetDragImage(element, x, y);
    }
  }

  @JsProperty(name = "setDragImage")
  private native Object getSetDragImage();

  @JsMethod(name = "setDragImage")
  private native void callSetDragImage(Element element, int x, int y);

  /**
   * Specify the drop effect to use on dragenter or dragover events.
   *
   * @param dropEffect the drop effect to display.
   */
  @JsOverlay
  public final void setDropEffect(DropEffect dropEffect) {
    this.setDropEffect(dropEffect.name().toLowerCase(Locale.ROOT));
  }

  /**
   * Specify the drop effect to use on dragenter or dragover events.
   *
   * @param dropEffect the drop effect to display.
   */
  @JsOverlay
  private void setDropEffect(String dropEffect) {
    if (Js.isTruthy(Js.<elemental2.dom.DataTransfer>uncheckedCast(this).dropEffect)) {
      Js.<elemental2.dom.DataTransfer>uncheckedCast(this).dropEffect = dropEffect;
    }
  }

  /**
   * Used to specify the drop effect to use on dragenter or dragover events.
   *
   * <p>For dragstart, drag, and dragleave events, the dropEffect is initialized to "none". Any
   * value assigned to the dropEffect will be set, but the value isn't used for anything.
   */
  public enum DropEffect {
    /** a copy of the source item is made at the new location. */
    COPY,

    /** an item is moved to a new location. */
    MOVE,

    /** a link is established to the source at the new location. */
    LINK,

    /** the item may not be dropped. */
    NONE;
  }
}
