/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package ok2c.httpcomponents.release.pom

class PomModule {

    final String name
    final PomArtifact artifact

    PomModule(String name, PomArtifact artifact) {
        this.name = name
        this.artifact = artifact
    }

    String getName() {
        return name
    }

    PomArtifact getArtifact() {
        return artifact
    }

    String getGroupId() {
        artifact.groupId
    }

    String getArtifactId() {
        artifact.id
    }

    String getVersion() {
        artifact.version
    }

}
