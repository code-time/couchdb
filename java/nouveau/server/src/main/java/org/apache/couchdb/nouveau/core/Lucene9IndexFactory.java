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

package org.apache.couchdb.nouveau.core;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.couchdb.nouveau.api.IndexDefinition;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.search.SearcherFactory;

public class Lucene9IndexFactory implements IndexFactory {

    private Lucene9AnalyzerFactory analyzerFactory;

    private SearcherFactory searcherFactory;

    public void setAnalyzerFactory(final Lucene9AnalyzerFactory analyzerFactory) {
        this.analyzerFactory = analyzerFactory;
    }

    public void setSearcherFactory(final SearcherFactory searcherFactory) {
        this.searcherFactory = searcherFactory;
    }

    @Override
    public Index open(Path path, final IndexDefinition indexDefinition) throws IOException {
        final Analyzer analyzer = analyzerFactory.fromDefinition(indexDefinition);
        return Lucene9Index.open(path, analyzer, searcherFactory);
    }

}
