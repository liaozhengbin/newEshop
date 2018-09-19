$(function(){
	
	var url="index?method=login";

	$.post(url,null,function(response){
		var jsonObj=$.parseJSON(response);
		if(jsonObj.status==200){
			var list=jsonObj.bookList;
			
			var str = '<dt><a href="#" class="more">更多&nbsp;<span class="more-sign">&gt;</span></a><strong>新书上架 <span class="name-en">/New</span></strong></dt>';
			for(var i=0;i<list.length;i++){
				var obj=list[i];
				str+="<dd class='sidebar_articles'><span>"+obj.book_date+"</span><a target='_blank' href='#'>"+obj.book_name+"</a></dd>";
			}
			$("#book").html(str);
		}
	});
	
}); 

