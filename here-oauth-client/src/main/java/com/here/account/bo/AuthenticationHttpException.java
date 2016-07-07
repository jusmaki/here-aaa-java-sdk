/*
 * Copyright 2016 HERE Global B.V.
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
package com.here.account.bo;

import com.here.account.oauth2.bo.ErrorResponse;

/**
 * If you had trouble authenticating, and got an HTTP response, 
 * you get an AuthenticationException.
 * This could be because the client or resource owner failed to 
 * properly authenticate a request to the authorization server, 
 * or because the request could not be fulfilled for some other 
 * reason.
 * 
 * @author kmccrack
 *
 */
public class AuthenticationHttpException extends Exception {

    /**
     * default.
     */
    private static final long serialVersionUID = 1L;
    
    private final int statusCode;
    private final ErrorResponse errorResponse;
    
    public AuthenticationHttpException(int statusCode, ErrorResponse errorResponse) {
        super("HTTP status code " + statusCode + ", body " + errorResponse);
        this.statusCode = statusCode;
        this.errorResponse = errorResponse;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

}