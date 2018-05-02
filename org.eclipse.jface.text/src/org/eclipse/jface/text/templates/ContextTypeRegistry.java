/*******************************************************************************
 * Copyright (c) 2000, 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.text.templates;

import java.util.Iterator;

/**
 * A registry for context types. Editor implementors will usually instantiate a
 * registry and configure the context types available in their editor.
 * <p>
 * In order to pick up templates contributed using the <code>org.eclipse.ui.editors.templates</code>
 * extension point, use a <code>ContributionContextTypeRegistry</code>.
 * </p>
 *
 * @since 3.0
 * @deprecated See {@link ContextTypeRegistry} from org.eclipse.text
 */
@Deprecated
public class ContextTypeRegistry extends org.eclipse.text.templates.ContextTypeRegistry {

	@Override
	public void addContextType(TemplateContextType contextType) {
		super.addContextType(contextType);
	}

	@Override
	public TemplateContextType getContextType(String id) {
		return super.getContextType(id);
	}

	@Override
	public Iterator<TemplateContextType> contextTypes() {
		return super.contextTypes();
	}
}
