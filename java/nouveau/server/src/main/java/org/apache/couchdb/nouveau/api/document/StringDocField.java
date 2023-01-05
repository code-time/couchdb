//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.couchdb.nouveau.api.document;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class StringDocField extends DocField {

    private String value;

    private boolean stored;

    public StringDocField() {
    }

    public StringDocField(final String name, String value, boolean stored) {
        this.name = name;
        this.value = value;
        this.stored = stored;
    }

    @JsonProperty
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty
    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }

    @Override
    public String toString() {
        return "StringDocField [name=" + name + ", value=" + value + ", stored=" + stored + "]";
    }

}
