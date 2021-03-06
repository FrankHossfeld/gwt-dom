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
package org.gwtproject.dom.builder.shared;

import org.gwtproject.safehtml.shared.SafeHtml;

/** HTML-based implementation of {@link StyleBuilder}. */
public class HtmlStyleBuilder extends HtmlElementBuilderBase<StyleBuilder> implements StyleBuilder {

  HtmlStyleBuilder(HtmlBuilderImpl delegate) {
    super(delegate);
  }

  @Override
  public StyleBuilder cssText(String cssText) {
    // Append style rules as you would append inner text.
    return super.text(cssText);
  }

  @Override
  public StyleBuilder disabled() {
    return trustedAttribute("disabled", "disabled");
  }

  @Override
  public StyleBuilder html(SafeHtml html) {
    throw new UnsupportedOperationException(UNSUPPORTED_HTML);
  }

  @Override
  public boolean isChildElementSupported() {
    return false;
  }

  @Override
  public StyleBuilder media(String media) {
    return trustedAttribute("media", media);
  }

  @Override
  public StyleBuilder text(String text) {
    throw new UnsupportedOperationException(UNSUPPORTED_HTML);
  }

  @Override
  public StyleBuilder type(String type) {
    return trustedAttribute("type", type);
  }
}
