/*
 * Copyright (C) 2018 Google Inc.
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

package com.example.android.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * This activity is blank for now. Subsequent versions of the app
 * provide input controls and a delivery method for an order.
 */
public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public class MainActivity extends AppCompatActivity{

        private RadioGroup list_opsi;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            list_opsi = findViewById(R.id.opsi);
            list_opsi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int id) {
                    switch (id){
                        case R.id.merahh:
                            Toast.makeText(getApplication(), "Saya Suka merah", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.kuningg:
                            Toast.makeText(getApplication(), "Saya Suka kuning", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.hijauu:
                            Toast.makeText(getApplication(), "Saya Suka hijau", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.biruu:
                            Toast.makeText(getApplication(), "Saya suka biru", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });
        }

    }
}

