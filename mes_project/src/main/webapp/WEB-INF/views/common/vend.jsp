<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>
	<div class="container-fluid px-4">
		<h1 class="mt-4">공통코드관리</h1>
		<ol class="breadcrumb mb-4">
			<li class="breadcrumb-item"><a href="home.do">홈</a></li>
			<li class="breadcrumb-item">> 기준정보관리</li>
			<li class="breadcrumb-item active">> 거래처관리</li>
		</ol>
		<div class="card mb-4">
			<div class="card-body">
				입력조건 넣기
			</div>
		</div>
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i> DataTable Example
			</div>
			<div class="card-body">
				<div id="grid"></div>
						<script>
    var Grid = tui.Grid;
     const data = [{
         id: '10012',
         city: 'Seoul',
         country: 'South Korea'
       },
       {
         id: '10013',
         city: 'Tokyo',
         country: 'Japan'
       }
     ]
    // case 1 : 인스턴스 생성시 data 옵션으로 데이터 입력
    const grid = new Grid({
      el: document.getElementById('grid'),
      data : data ,
      //data만 적어도 가능(축약형)
      columns: [{
          header: 'ID',
          name: 'id',
        	sortable: true,
          sortingType: 'desc'
        },
        {
          header: 'CITY',
          name: 'city',
          editor: 'text',
        	sortable: true,
          sortingType: 'desc'
        }
      ]
    });
    //ajax조회하고 grid
    //$.ajax({
    //  url: 'data.json'
    //}).done(result => grid.resetData(result) ) //람다식표현
    // }).done(function (result) {
    //   // case 2 : resetData() 메서드로 입력
    //   grid.resetData(result);
    // })
    grid.on('click', ev => {
      console.log(ev.rowKey)
      console.log(ev.columnName)
      var value = grid.getValue(ev.rowKey,ev.columnName);
      console.log(value);
    })
  </script>
			</div>
		</div>
	</div>
</body>
</html>