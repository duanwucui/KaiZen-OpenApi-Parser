/*******************************************************************************
 *  Copyright (c) 2017 ModelSolv, Inc. and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     ModelSolv, Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package com.reprezen.swaggerparser.val3;

import com.reprezen.swaggerparser.model3.Contact;
import com.reprezen.swaggerparser.val.ObjectValidatorBase;
import com.reprezen.swaggerparser.val.ValidationResults;

public class ContactValidator extends ObjectValidatorBase<Contact> {

    @Override
    public void validateObject(Contact contact, ValidationResults results) {
        validateUrl(contact.getUrl(), results, false, "url");
        validateEmail(contact.getEmail(), results, false, "email");
        validateExtensions(contact.getExtensions(), results);
    }

}