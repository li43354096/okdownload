/*
 * Copyright (c) 2018 LingoChamp Inc.
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

package com.liulishuo.okdownload.core.breakpoint;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.liulishuo.okdownload.core.cause.EndCause;

public interface DownloadStore extends BreakpointStore {

    void onSyncToFilesystemSuccess(@NonNull BreakpointInfo info, int blockIndex,
                                   long increaseLength);

    void onTaskStart(int id);

    void onTaskEnd(int id, @NonNull EndCause cause, @Nullable Exception exception);

    void bunchTaskCanceled(int[] ids);
}
