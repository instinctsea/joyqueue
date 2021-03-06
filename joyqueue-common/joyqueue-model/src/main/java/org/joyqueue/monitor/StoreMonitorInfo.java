/**
 * Copyright 2019 The JoyQueue Authors.
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
package org.joyqueue.monitor;

/**
 * StoreMonitorInfo
 *
 * author: gaohaoxiang
 * date: 2018/12/29
 */
public class StoreMonitorInfo {

    private boolean started;

    private String totalSpace;
    private String freeSpace;
    private long totalSpaceBytes;
    private long freeSpaceBytes;

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean isStarted() {
        return started;
    }

    public String getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(String totalSpace) {
        this.totalSpace = totalSpace;
    }

    public String getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(String freeSpace) {
        this.freeSpace = freeSpace;
    }

    public long getTotalSpaceBytes() {
        return totalSpaceBytes;
    }

    public void setTotalSpaceBytes(long totalSpaceBytes) {
        this.totalSpaceBytes = totalSpaceBytes;
    }

    public long getFreeSpaceBytes() {
        return freeSpaceBytes;
    }

    public void setFreeSpaceBytes(long freeSpaceBytes) {
        this.freeSpaceBytes = freeSpaceBytes;
    }
}