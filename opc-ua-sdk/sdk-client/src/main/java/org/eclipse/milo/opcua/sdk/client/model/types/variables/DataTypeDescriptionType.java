/*
 * Copyright (c) 2017 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.client.model.types.variables;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.core.ValueRanks;
import org.eclipse.milo.opcua.sdk.core.model.QualifiedProperty;
import org.eclipse.milo.opcua.stack.core.types.builtin.ByteString;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;

public interface DataTypeDescriptionType extends BaseDataVariableType {
    QualifiedProperty<String> DATA_TYPE_VERSION = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "DataTypeVersion",
        NodeId.parse("ns=0;i=12"),
        ValueRanks.Scalar,
        String.class
    );

    QualifiedProperty<ByteString> DICTIONARY_FRAGMENT = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "DictionaryFragment",
        NodeId.parse("ns=0;i=15"),
        ValueRanks.Scalar,
        ByteString.class
    );

    CompletableFuture<? extends PropertyType> getDataTypeVersionNode();

    CompletableFuture<String> getDataTypeVersion();

    CompletableFuture<StatusCode> setDataTypeVersion(String value);

    CompletableFuture<? extends PropertyType> getDictionaryFragmentNode();

    CompletableFuture<ByteString> getDictionaryFragment();

    CompletableFuture<StatusCode> setDictionaryFragment(ByteString value);
}
