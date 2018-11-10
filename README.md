## Attention: This is a fork of the apparently dead project https://github.com/pedant/sweet-alert-dialog/
**The only changes made are to update it to work with materialish-progress 1.7 and the current gradle build tools.**

The original readme with minor alterations follows.  I've removed the Chinese language readme as I can only read and write English.

I did not write this library, I just removed and fixed some bugs . All credit goes to pedant.

Awesome Dialog
===================
AwesomeAlertDialog for Android, a beautiful and clever alert dialog

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Sweet%20Alert%20Dialog-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1065)

Inspired by JavaScript [SweetAlert](http://tristanedwards.me/sweetalert)

[Demo Download](https://github.com/pedant/sweet-alert-dialog/releases/download/v1.1/sweet-alert-sample-v1.1.apk)

## ScreenShot
![image](https://github.com/pedant/sweet-alert-dialog/raw/master/change_type.gif)

## Setup
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.bhattaraisubash:AwesomeDialog:v1.0'
	}

## Usage

show material progress

    AwesomeAlertDialog pDialog = new AwesomeAlertDialog(this, AwesomeAlertDialog.PROGRESS_TYPE);
    pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
    pDialog.setTitleText("Loading");
    pDialog.setCancelable(false);
    pDialog.show();

![image](https://github.com/pedant/sweet-alert-dialog/raw/master/play_progress.gif)

You can customize progress bar dynamically with materialish-progress methods via **AwesomeAlertDialog.getProgressHelper()**:
- resetCount()
- isSpinning()
- spin()
- stopSpinning()
- getProgress()
- setProgress(float progress)
- setInstantProgress(float progress)
- getCircleRadius()
- setCircleRadius(int circleRadius)
- getBarWidth()
- setBarWidth(int barWidth)
- getBarColor()
- setBarColor(int barColor)
- getRimWidth()
- setRimWidth(int rimWidth)
- getRimColor()
- setRimColor(int rimColor)
- getSpinSpeed()
- setSpinSpeed(float spinSpeed)

thanks to the project [materialish-progress](https://github.com/pnikosis/materialish-progress) and [@croccio](https://github.com/croccio) participation.

more usages about progress, please see the sample.

A basic message：

    new AwesomeAlertDialog(this)
        .setTitleText("Here's a message!")
        .show();

A title with a text under：

    new AwesomeAlertDialog(this)
        .setTitleText("Here's a message!")
        .setContentText("It's pretty, isn't it?")
        .show();

A error message：

    new AwesomeAlertDialog(this, AwesomeAlertDialog.ERROR_TYPE)
        .setTitleText("Oops...")
        .setContentText("Something went wrong!")
        .show();

A warning message：

    new AwesomeAlertDialog(this, AwesomeAlertDialog.WARNING_TYPE)
        .setTitleText("Are you sure?")
        .setContentText("Won't be able to recover this file!")
        .setConfirmText("Yes,delete it!")
        .show();

A success message：

    new AwesomeAlertDialog(this, AwesomeAlertDialog.SUCCESS_TYPE)
        .setTitleText("Good job!")
        .setContentText("You clicked the button!")
        .show();

A message with a custom icon：

    new AwesomeAlertDialog(this, AwesomeAlertDialog.CUSTOM_IMAGE_TYPE)
        .setTitleText("Sweet!")
        .setContentText("Here's a custom image.")
        .setCustomImage(R.drawable.custom_img)
        .show();

Bind the listener to confirm button：

    new AwesomeAlertDialog(this, AwesomeAlertDialog.WARNING_TYPE)
        .setTitleText("Are you sure?")
        .setContentText("Won't be able to recover this file!")
        .setConfirmText("Yes,delete it!")
        .setConfirmClickListener(new AwesomeAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(AwesomeAlertDialog sDialog) {
                sDialog.dismissWithAnimation();
            }
        })
        .show();

Show the cancel button and bind listener to it：

    new AwesomeAlertDialog(this, AwesomeAlertDialog.WARNING_TYPE)
        .setTitleText("Are you sure?")
        .setContentText("Won't be able to recover this file!")
        .setCancelText("No,cancel plx!")
        .setConfirmText("Yes,delete it!")
        .showCancelButton(true)
        .setCancelClickListener(new AwesomeAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(AwesomeAlertDialog sDialog) {
                sDialog.cancel();
            }
        })
        .show();

**Change** the dialog style upon confirming：

    new AwesomeAlertDialog(this, AwesomeAlertDialog.WARNING_TYPE)
        .setTitleText("Are you sure?")
        .setContentText("Won't be able to recover this file!")
        .setConfirmText("Yes,delete it!")
        .setConfirmClickListener(new AwesomeAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(AwesomeAlertDialog sDialog) {
                sDialog
                    .setTitleText("Deleted!")
                    .setContentText("Your imaginary file has been deleted!")
                    .setConfirmText("OK")
                    .setConfirmClickListener(null)
                    .changeAlertType(AwesomeAlertDialog.SUCCESS_TYPE);
            }
        })
        .show();

[more android tech shares: pedant.cn](http://www.pedant.cn)

## License

    The MIT License (MIT)

    Copyright (c) 2014 Pedant(http://pedant.cn)

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.

