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

/**
 * Represents a notification/event that is sent to an endpoint through data
 * channels when there is a change in the simulcast substream the bridge is
 * pushing to that specific endpoint.
 */
public class SimulcastStreamsChangingEvent
{
    final String colibriClass = "SimulcastStreamsChangingEvent";
    public EndpointSimulcastStream[] endpointSimulcastStreams;
}
