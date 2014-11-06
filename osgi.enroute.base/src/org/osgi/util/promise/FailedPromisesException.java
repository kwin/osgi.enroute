/*
 * Copyright (c) OSGi Alliance (2014). All Rights Reserved.
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

package org.osgi.util.promise;

import java.util.Collection;
import java.util.Collections;

/**
 * Promise failure exception for a collection of failed Promises.
 * 
 * @author $Id: 2c65e5ee31944959ce6961faef48ec4407fcdb98 $
 */
public class FailedPromisesException extends RuntimeException {
	private static final long				serialVersionUID	= 1L;
	private final Collection<Promise<?>>	failed;

	/**
	 * Create a new FailedPromisesException with the specified Promises.
	 * 
	 * @param failed A collection of Promises that have been resolved with a
	 *        failure. Must not be {@code null}.
	 */
	public FailedPromisesException(Collection<Promise<?>> failed) {
		super();
		this.failed = Collections.unmodifiableCollection(failed);
	}

	/**
	 * Returns the collection of Promises that have been resolved with a
	 * failure.
	 * 
	 * @return The collection of Promises that have been resolved with a
	 *         failure. The returned collection is unmodifiable.
	 */
	public Collection<Promise<?>> getFailedPromises() {
		return failed;
	}
}
