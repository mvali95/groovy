/*
 * Copyright 2003-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package semantics

class LabelsTest extends GroovyTestCase {
    void testLabels() {
        // tag::test_labels[]
        given:
            def x = 1
            def y = 2
        when:
            def z = x+y
        then:
            assert z == 3
        // end::test_labels[]
    }

    void testUseOfLabel() {
        // tag::label_bad_practice[]
        for (int i=0;i<10;i++) {
            for (int j=0;j<i;j++) {
                println "j=$j"
                if (j == 5) {
                    break exit
                }
            }
            exit: println "i=$i"
        }
        // end::label_bad_practice[]
    }
}
