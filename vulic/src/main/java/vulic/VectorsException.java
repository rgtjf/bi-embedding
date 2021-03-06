/*
 * Copyright 2014 Radialpoint SafeCare Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package vulic;

/**
 * Exception class, for internal errors, mostly due to serialization problems.
 */
public class VectorsException extends Exception {

    private static final long serialVersionUID = 1L;

    public VectorsException() {
        super();
    }

    public VectorsException(String message) {
        super(message);
    }

    public VectorsException(Throwable cause) {
        super(cause);
    }

    public VectorsException(String message, Throwable cause) {
        super(message, cause);
    }

}