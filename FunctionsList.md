# Array functions #

```
array arrayCreate(firstElement, secondElement, ...)
```
creates an array containing provided elements

```
element arrayGet(array,index)
```
returns array element from selected index

```
int arraySize(array)
```
returns the number of items in array


example:
```
array=arrayCreate(”one”,4.5,10,”last”)
while a<arraySize(array)
    log(arrayGet(array,a))
    a=a+1
endwhile
```

# User input/output functions #

```
int buttonsInput(String message, String button1Text, String button2Text,...)
```

presents message and set of buttons. it returns number of button that was selected by user

```
int inputNumber(String message, int minValue, int maxValue)
```
shows a message and wait for user to put a number. number has to be in between minValue and maxValue. it returns entered number

```
message(String message)
```
shows a message to user and waits for confirmation (ok button)

```
int question(String message)
```
asks a question (message) and wait for an answer. user can select yes or no answer. it returns 1 when user takes yes and 0 otherwise

```
log(String message)
```
adds a message to logs stack

```
wait(int time)
```
waits time\*10 seconds

# Camera functions #

```
capture()
```
takes photo. when autofocus is set performs auto focus before photo is taken

```
performAF()
```
tries to set focus on frame. command is ignored when manual focus is set

# Camera properties functions #

List of properties is valid for nikon D5100. For other cameras some of the functions can be unavailable.

<table>
<blockquote><tr>
<blockquote><td>functions</td>
<td>available values</td>
<td>remarks</td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getActiveDLighting()<br>
setActiveDLighting(value)<br>
</code></pre>
</td>
<td>"Extra high", "High", "Normal", "Low", "No", "Auto"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getAEBracketingCount()<br>
</code></pre>
</td>
<td>number</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getAEBracketingStep()<br>
setAEBracketingStep(value)<br>
</code></pre>
</td>
<td>"1/3", "1/2", "2/3", "1", "1 1/3", "1 1/2", "1 2/3", "2"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getAFModeSelect()<br>
setAFModeSelect(value)<br>
</code></pre>
</td>
<td>"AF-S", "AF-C", "AF-A", "MF<tt>[</tt>f<tt>]</tt>", "MF"</td>
<td>
value 'MF<tt>[</tt>f<tt>]</tt>' means that property is set by switch on camera, so it can't be changed via script</td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getAutoDistortion()<br>
setAutoDistortion(value)<br>
</code></pre>
</td>
<td>boolean (0/1)</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getBracketingType()<br>
setBracketingType(value)<br>
</code></pre>
</td>
<td>"AE", "WB", "ADL"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getBurstNumber()<br>
setBurstNumber(value)<br>
</code></pre>
</td>
<td>number</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getColorSpace()<br>
setColorSpace(value)<br>
</code></pre>
</td>
<td>"sRGB", "Adobe RGB"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getCompressionSetting()<br>
setCompressionSetting(value)<br>
</code></pre>
</td>
<td>"B", "N", "F", "R", "R+B", "R+N", "R+F"</td>
<td>B - JPG Basic<br />N - JPG Normal<br />F - JPG File<br />R - RAW</td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getContinuousShootingCount()<br>
</code></pre>
</td>
<td>number</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getEffectMode()<br>
setEffectMode(value)<br>
</code></pre>
</td>
<td>"Night vision", "Color sketch", "Miniature effects", "Select color", "Silhouette", "High key", "Low key"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getEnableBracketing()<br>
setEnableBracketing(value)<br>
</code></pre>
</td>
<td>boolean (0/1)</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getExposureBiasCompensation()<br>
setExposureBiasCompensation(value)<br>
</code></pre>
</td>
<td>"-5", "-4 2/3", "-4 1/2", "-4 1/3", "-4", "-3 2/3", "-3 1/2", "-3 1/3", "-3", "-2 2/3", "-2 1/2", "-2 1/3", "-2", "-1 2/3", "-1 1/2", "-1 1/3", "-1", "-2/3", "-1/2", "-1/3", "0", "+1/3", "+1/2", "+2/3", "+1", "+1 1/3", "+1 1/2", "+1 2/3", "+2", "+2 1/3", "+2 1/2", "+2 2/3", "+3", "+3 1/3", "+3 1/2", "+3 2/3", "+4", "+4 1/3", "+4 1/2", "+4 2/3", "+5"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getExposureEVStep()<br>
setExposureEVStep(value)<br>
</code></pre>
</td>
<td>"1/3", "1/2"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getExposureIndex()<br>
setExposureIndex(value)<br>
</code></pre>
</td>
<td>"100", "125", "160", "200", "250", "320", "400", "500", "640", "800", "1000", "1250", "1600", "2000", "2500", "3200", "4000", "5000", "6400", "Hi 0.3", "Hi 0.7", "Hi 1", "Hi 2"</td>
<td>list of values is valid for nikon D5100. for other cameras some of values can be unavailable</td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getExposureMeteringMode()<br>
setExposureMeteringMode(value)<br>
</code></pre>
</td>
<td>"Center", "Multi", "Spot"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getExposureProgramMode()<br>
</code></pre>
</td>
<td>"M", "P", "A", "S", "AUTO", "Portrait", "Landscape", "Close up", "Sports", "Flash prohibition", "Child", "SCENE", "EFFECTS"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getExposuresRemaining()<br>
</code></pre>
</td>
<td>number</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getExposureTime()<br>
setExposureTime(value)<br>
</code></pre>
</td>
<td>number</td>
<td>
value 0.0 indicates bulb time (valid only in 'M' exposure program)</td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getFlashMode()<br>
setFlashMode(value)<br>
</code></pre>
</td>
<td>"Flash prohibited", "Red-eye reduction", "Front curtain sync", "Slow sync", "Rear curtain sync", "Red-eye reduction slow sync"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getFnumber()<br>
setFnumber(value)<br>
</code></pre>
</td>
<td>number</td>
<td>list of valid values depends on current camera settings<br />examples:<br />1.8, 5.6, 22</td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getFocusMeteringMode()<br>
setFocusMeteringMode(value)<br>
</code></pre>
</td>
<td>"Dynamic", "Single", "Auto", "3D"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getFocusMode()<br>
</code></pre>
</td>
<td>"M", "S", "C", "A", "F"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getHDREv()<br>
setHDREv(value)<br>
</code></pre>
</td>
<td>"Auto", "1", "2", "3"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getHDRMode()<br>
setHDRMode(value)<br>
</code></pre>
</td>
<td>boolean (0/1)</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getHDRSmoothing()<br>
setHDRSmoothing(value)<br>
</code></pre>
</td>
<td>"High", "Normal", "Low"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getLensApatureMax()<br>
</code></pre>
</td>
<td>number</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getLensApatureMin()<br>
</code></pre>
</td>
<td>number</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getNoiseReduction()<br>
setNoiseReduction(value)<br>
</code></pre>
</td>
<td>boolean (0/1)</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getNoiseReductionHiIso()<br>
setNoiseReductionHiIso(value)<br>
</code></pre>
</td>
<td>"Not performed", "Low", "Normal", "High"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getRemainingExposure()<br>
</code></pre>
</td>
<td>number</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getSceneMode()<br>
setSceneMode(value)<br>
</code></pre>
</td>
<td>"Night landscape", "Party/indoor", "Beach/snow", "Sunset", "Dusk/dawn", "Pet portrait", "Candlelight", "Blossom", "Autumn colors", "Food", "Night portrait"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getStillCaptureMode()<br>
setStillCaptureMode(value)<br>
</code></pre>
</td>
<td>"Single", "Continuous", "Self-timer", "Quick remote", "2s remote", "Quiet"</td>
<td><br /></td>
</blockquote></tr>
<tr>
<blockquote><td>
<pre><code>value getWhiteBalance()<br>
setWhiteBalance(value)<br>
</code></pre>
</td>
<td>"Auto", "Sunny", "Fluorescent", "Incandescent", "Flash", "Cloudy", "Shade", "Preset manual"</td>
<td><br /></td>
</blockquote></tr>
</table>