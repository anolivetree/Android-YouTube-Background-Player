/*
 * Copyright (C) 2017 kkkkan
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

package com.kkkkan.youtube.tubtub.interfaces;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.kkkkan.youtube.tubtub.model.YouTubeVideo;

import java.util.List;

/**
 * Created by smedic on 5.3.17..
 */

public interface OnItemSelected {

    void onPlaylistSelected(@Nullable RecyclerView recyclerView, List<YouTubeVideo> playlist, int position);
}
