<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
   background: #eee
}

#container {
   width : 98%;
   margin : 0 auto;
}

.col {
   width: 100%
}

.c_btn {
   color: #fff;
   font-size: 13px;
   background: #333;
   border: none;
   padding: 6px;
   border-radius: 4px
}

.c_btn:hover {
   background: #555;
}

.linelist {
   float: right;
   margin-top: 0px;
}
</style>
<link rel="stylesheet" href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"
   integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
   crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
   <!-- 헤더부분 -->
   <div class="container-fluid px-4">
      <h1 class="mt-4">공정관리</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">생산</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
      <div id="container">
              <section>
            <div class="col">
               <div class="card mb-4">
                  <div class="card-header">
                     <i class="fas fa-table me-1"></i> 조건설정
                  </div>
                  <div class="card-body">
                     
                     <form>
                        <div class="mb-3">
                           <label for="name">공정구분</label> 
               				<select>
               					<option>가열</option>
               					<option>금속검출</option>
               				</select>
                        </div>
     					<div class="linelist">
                        <button id="sBtn" class="c_btn" form="">검색</button>
                        <button class="c_btn" form="">초기화</button>
                     </div>
              	
                     </form>
                  </div>
               </div>
            </div>
         </section>
          <div id='grid'>
	          <div class="linelist">
	             <button id="addBtn" class="c_btn" form="">추가</button>
	          </div>
          </div>
      </div>
   <br>

   <script>
   
	const gridData = [{}] 

      const grid = new tui.Grid({
          el: document.getElementById('grid'),
          data: gridData,
          scrollX: false,
          scrollY: false,
          rowHeaders: ['checkbox'],
          columns: [
            {
              header: '공정코드',
              name: 'prcsCd',
              editor: 'text'
            },
            {
              header: '공정명',
              name: 'prcsNm',
              editor: 'text'
            },
            {
              header: '공정구분',
              name: 'prcsFg',
              editor: 'text'
            },
            {
              header: '공정설명',
              name: 'prcsCtnt',
              editor: 'text'
            }
          ]
        });

   
   $(function(){
	   $.ajax({
		   url:'prcsList'
	   }).done(function(result){
		   grid.resetData(result);
	   })
	   
	   var rowData = [{prcsCd: "", prcsNm: "", prcsFg: "",  prcsCtnt: ""}]
	   $("#addBtn").on("click", function(e){
		   grid.appendRow(rowData,{
			   at : grid.getRowCount(),
			   focus : true
			   });
			   grid.enable()
	   })
	   
	   $("#sBtn").on("click", function(e){
		   $.ajax({
			   url:''
		   }).done(function(result) {
			   grid.resetData(result);
		   })
	   })
	   
   })

   </script>
</body>

</html>