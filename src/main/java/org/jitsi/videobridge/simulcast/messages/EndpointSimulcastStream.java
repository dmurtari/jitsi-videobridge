/*
 * Copyright @ 2015 Atlassian Pty Ltd
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
package org.jitsi.videobridge.simulcast.messages;

import org.jitsi.videobridge.simulcast.*;

/**
 * Associates a simulcast simStream with an endpoint ID.
 */
public class EndpointSimulcastStream
{
    public EndpointSimulcastStream(String endpoint,
                                  SimulcastStream simulcastStream)
    {
        this.endpoint = endpoint;
        this.simulcastStream = simulcastStream;
    }

    public final String endpoint;
    public final SimulcastStream simulcastStream;
}
