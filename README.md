# VideoTrimmerCompressor
After facing the issue of duplicate class error that comes up when using 
<a href="https://github.com/Tourenathan-G5organisation/SiliCompressor">SiliCompressor</a> and 
<a href="https://github.com/AndroidDeveloperLB/VideoTrimmer">Video Trimmer</a>
in your app, I decided to apply a known solution which combines both libraries together and use just one of 
the conflicting dependency. See <a href="https://stackoverflow.com/a/54367038/8900747">this</a>
for more details about the solution.

<b>Please not that this library does not in anyway interfere/affect the functionality or primary purpose of
SiliCompressor or VideoTrimmer, 
this library is to help other developers that encounters the same issue, and save them some time!</b>

## setup

Remove all existing dependency of silicompressor and videotrimmer library and add this dependency
```
implementation 'com.github.tobioyelekan:VideoTrimmerCompressor:1.0.0
