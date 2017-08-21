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
package org.eclipse.che.api.debug.shared.dto;

import java.util.List;
import org.eclipse.che.api.debug.shared.model.ThreadDump;
import org.eclipse.che.api.debug.shared.model.ThreadStatus;
import org.eclipse.che.dto.shared.DTO;

/** @author Anatolii Bazko */
@DTO
public interface ThreadDumpDto extends ThreadDump {

  @Override
  long getId();

  void setId(long id);

  ThreadDumpDto withId(long id);

  @Override
  String getName();

  void setName(String name);

  ThreadDumpDto withName(String name);

  @Override
  String getGroupName();

  void setGroupName(String groupName);

  ThreadDumpDto withGroupName(String groupName);

  @Override
  List<StackFrameDumpDto> getFrames();

  void setFrames(List<StackFrameDumpDto> frames);

  ThreadDumpDto withFrames(List<StackFrameDumpDto> frames);

  @Override
  ThreadStatus getStatus();

  void setStatus(ThreadStatus status);

  ThreadDumpDto withStatus(ThreadStatus status);

  @Override
  boolean isSuspended();

  void setSuspended(boolean suspended);

  ThreadDumpDto withSuspended(boolean suspended);
}
