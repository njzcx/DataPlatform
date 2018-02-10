jQuery.validator.addMethod("checkPicType", function(value, element) {
	var pictype = ["jpg", "bmp", "png", "gif"];
    var filename = element.files[0].name;
    //获得上传文件名
    var fileArr = filename.toLowerCase().split(".");
    var filetype = fileArr[fileArr.length-1];
    //切割出后缀文件名
    if(pictype.indexOf(filetype) == -1){
        return false;
    }else{
        return true;
    }
}, "上传图片格式不适合");

jQuery.validator.addMethod("checkPicSize", function(value,element) {
    var fileSize = element.files[0].size;
    var maxSize = 2*1024*1024;
    if(fileSize > maxSize){
        return false;
    }else{
        return true;
    }
}, "图片大小不得超过2M");