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

/** Builds an meta element. */
public interface MetaBuilder extends ElementBuilderBase<MetaBuilder> {

  /**
   * Associated information.
   *
   * @see <a
   *     href="http://www.w3.org/TR/1999/REC-html401-19991224/struct/global.html#adef-content">W3C
   *     HTML Specification</a>
   */
  MetaBuilder content(String content);

  /**
   * HTTP response header name [IETF RFC 2616].
   *
   * @see <a
   *     href="http://www.w3.org/TR/1999/REC-html401-19991224/struct/global.html#adef-http-equiv">W3C
   *     HTML Specification</a>
   */
  MetaBuilder httpEquiv(String httpEquiv);

  /**
   * Meta information name.
   *
   * @see <a
   *     href="http://www.w3.org/TR/1999/REC-html401-19991224/struct/global.html#adef-name-META">W3C
   *     HTML Specification</a>
   */
  MetaBuilder name(String name);
}
