# ORCamera
#### Android 好用的身份证拍照界面封装
`手持身份证`调用
```java
                Intent intent = new Intent(this, CameraActivity.class);
                intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH,filePath);
                intent.putExtra(CameraActivity.KEY_CONTENT_TYPE, CameraActivity.CONTENT_TYPE_GENERAL);
                startActivityForResult(intent, REQUEST_CODE);
```
`身份证正面`调用
```java
                Intent intent = new Intent(this, CameraActivity.class);
                intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH,filePath);
                intent.putExtra(CameraActivity.KEY_CONTENT_TYPE, CameraActivity.CONTENT_TYPE_ID_CARD_FRONT);
                startActivityForResult(intent, REQUEST_CODE);
```
`身份证反面`调用
```java
                Intent intent = new Intent(this, CameraActivity.class);
                intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH,filePath);
                intent.putExtra(CameraActivity.KEY_CONTENT_TYPE, CameraActivity.CONTENT_TYPE_ID_CARD_BACK);
                startActivityForResult(intent, REQUEST_CODE);
```
`CameraActivity.KEY_OUTPUT_FILE_PATH`：拍照后照片要保存的文件
`CameraActivity.KEY_CONTENT_TYPE`：拍照类型
+ CameraActivity.CONTENT_TYPE_GENERAL：手持身份证
+ CameraActivity.CONTENT_TYPE_ID_CARD_FRONT：身份证正面
+ CameraActivity.CONTENT_TYPE_ID_CARD_BACK：身份证反面
