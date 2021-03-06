/*
 * Copyright 2015 Otto (GmbH & Co KG)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.flinkspector.core.runtime;

/**
 * Used to wrap output from the sinks to the listeners during test runs
 */
public class OutputEvent {

    /**
     * serialized output event
     */
    private byte[] bytes;

    /**
     * id of the sink sending the event
     */
    private int sender;

    public void set(int sender, byte[] bytes) {
        this.sender = sender;
        this.bytes = bytes;
    }

    public byte[] getMsg() {
        return bytes;
    }

    public int getSender() {
        return sender;
    }

}
