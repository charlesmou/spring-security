/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.oauth2.core.oidc.endpoint;

/**
 * Standard parameter names defined in the OAuth Parameters Registry
 * and used by the authorization endpoint and token endpoint.
 *
 * @author Joe Grandja
 * @since 5.0
 * @see <a target="_blank" href="http://openid.net/specs/openid-connect-core-1_0.html#OAuthParametersRegistry">18.2 OAuth Parameters Registration</a>
 */
public interface OidcParameterNames {

	String ID_TOKEN = "id_token";

}
