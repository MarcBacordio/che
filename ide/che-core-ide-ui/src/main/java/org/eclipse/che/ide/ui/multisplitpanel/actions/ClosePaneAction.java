/*
 * Copyright (c) 2012-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ui.multisplitpanel.actions;

import org.eclipse.che.ide.api.action.Action;
import org.eclipse.che.ide.api.action.ActionEvent;
import org.eclipse.che.ide.ui.multisplitpanel.SubPanel;
import org.eclipse.che.ide.ui.multisplitpanel.WidgetToShow;

/**
 * Action for removing all widgets in the given {@link SubPanel} and closing the panel.
 *
 * @author Artem Zatsarynnyi
 */
public class ClosePaneAction extends Action {

  private final SubPanel subPanel;

  public ClosePaneAction(SubPanel subPanel) {
    super("Close Pane", "Close Pane", null, null);
    this.subPanel = subPanel;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (WidgetToShow widget : subPanel.getAllWidgets()) {
      subPanel.removeWidget(widget);
    }

    subPanel.closePane();
  }
}
