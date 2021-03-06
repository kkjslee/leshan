/*******************************************************************************
 * Copyright (c) 2013-2015 Sierra Wireless and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.leshan.core.response;

import org.eclipse.leshan.ResponseCode;

public class CreateResponse extends LwM2mResponse {

    private String location;

    public CreateResponse(ResponseCode code) {
        super(code);
    }

    public CreateResponse(ResponseCode code, String location) {
        super(code);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return String.format("CreateResponse [location=%s, code=%s]", location, code);
    }

}
