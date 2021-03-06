/**
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
package com.github.commonsrdf.api;

/**
 * An <a href= "http://www.w3.org/TR/rdf11-concepts/#dfn-rdf-triple" >RDF-1.1
 * Triple</a>, as defined by <a href= "http://www.w3.org/TR/rdf11-concepts/"
 * >RDF-1.1 Concepts and Abstract Syntax</a>, a W3C Recommendation published on
 * 25 February 2014.<br>
 *
 * @see <a href= "http://www.w3.org/TR/rdf11-concepts/#dfn-rdf-triple" >RDF-1.1
 *      Triple</a>
 */
public interface Triple {

	/**
	 * The subject of this triple, which may be either a {@link BlankNode} or an
	 * {@link IRI}, which are represented in Commons RDF by the interface
	 * {@link BlankNodeOrIRI}.
	 *
	 * @return The subject {@link BlankNodeOrIRI} of this triple.
	 * @see <a href="http://www.w3.org/TR/rdf11-concepts/#dfn-subject">RDF-1.1
	 *      Triple subject</a>
	 */
	BlankNodeOrIRI getSubject();

	/**
	 * The predicate {@link IRI} of this triple.
	 *
	 * @return The predicate {@link IRI} of this triple.
	 * @see <a href="http://www.w3.org/TR/rdf11-concepts/#dfn-predicate">RDF-1.1
	 *      Triple predicate</a>
	 */
	IRI getPredicate();

	/**
	 * The object of this triple, which may be either a {@link BlankNode}, an
	 * {@link IRI}, or a {@link Literal}, which are represented in Commons RDF
	 * by the interface {@link RDFTerm}.
	 *
	 * @return The object {@link RDFTerm} of this triple.
	 * @see <a href="http://www.w3.org/TR/rdf11-concepts/#dfn-object">RDF-1.1
	 *      Triple object</a>
	 */
	RDFTerm getObject();

	/**
	 * Check it this Triple is equal to another Triple.
	 * <p>
	 * Two Triples are equal if and only if their {@link #getSubject()},
	 * {@link #getPredicate()} and {@link #getObject()} are equal.
	 * </p>
	 * <p>
	 * Implementations MUST check the local scope for Triple comparison if
	 * either the subject or object is a BlankNode, and MAY check the local
	 * scope in other cases.
	 * </p>
	 * <p>
	 * Implementations MUST also override {@link #hashCode()} so that two equal
	 * Triples produce the same hash code.
	 * </p>
	 * 
	 * @see Object#equals(Object)
	 * 
	 * @param other
	 *            Another object
	 * @return true if other is a Triple and is equal to this
	 */
	@Override
	public boolean equals(Object other);

	/**
	 * Calculate a hash code for this Triple.
	 * <p>
	 * This method MUST be implemented when implementing {@link #equals(Object)}
	 * so that two equal IRIs produce the same hash code.
	 * </p>
	 * 
	 * @see Object#hashCode()
	 * 
	 * @return a hash code value for this Triple.
	 */
	@Override
	public int hashCode();

}
