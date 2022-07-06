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
	display: inline-block;
	float: right;
	margin-top: 0px;
	float: right;
}

label {
	width: 90px;
	float: left;
}

textarea {
	resize: none;
}
</style>
<link rel="stylesheet"
	href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>



</head>
<body>

	<!-- 헤더부분 -->
	<div class="container-fluid px-4">
		<h1 class="mt-4">설비관리</h1>
		<ol class="breadcrumb mb-4">
			<li class="breadcrumb-item active">설비점검내역</li>
		</ol>
	</div>
	<!-- 헤더부분 -->
	<div class="container-fluid px-4">
		<div class="row">
			<div class="col">
				<div class="card mb-4">
					<div class="card-header">
						<i class="fas fa-tachometer-alt"></i> 설비점검내역등록
					</div>

					<div class="card-body">
						<div class="row" style="margin-bottom: 3px">
							<div class="col-4">
								<div style="margin-bottom: 3px">
									<label for="">설비코드</label> <input type="text"
										readonly="readonly" id="" name="">
								</div>
								<div style="margin-bottom: 3px">
									<label for="">설비명</label> <input type="text"
										readonly="readonly" id="" name="">
								</div>
								<div style="margin-bottom: 3px">
									<label for="">점검일자</label> <input type="date" id="" name="">
								</div>

								<label>판정</label>
								<div class="form-check form-check-inline"
									style="margin-bottom: 3px">
									<input class="form-check-input" type="radio" name="useYN"
										id="Y" value="Y"> <label class="form-check-label"
										for="Y">적합</label> <input class="form-check-input"
										type="radio" name="useYN" id="N" value="N"> <label
										class="form-check-label" for="N">부적합</label>
								</div>

								<br> <label>가동여부</label>
								<div class="form-check form-check-inline"
									style="margin-bottom: 3px">
									<input class="form-check-input" type="radio" name="useYN"
										id="Y" value="Y"> <label class="form-check-label"
										for="Y">가동</label> <input class="form-check-input"
										type="radio" name="useYN" id="N" value="N"> <label
										class="form-check-label" for="N">비가동</label>
								</div>

							</div>
							<div class="col-4">
								<label for="" autofocus="autofocus">설비명</label> <input
									type="text" readonly="readonly" id="" name="">
								<button class="c_btn" form="">검색</button>
								<br> <label>조치사항</label>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="useYN"
										id="Y" value="Y"> <label class="form-check-label"
										for="Y">수리</label> <input class="form-check-input"
										type="radio" name="useYN" id="N" value="N"> <label
										class="form-check-label" for="N">점검</label>
								</div>
							</div>
							<div class="col">
								<label for="" autofocus="autofocus">조치내역</label>
								<textarea cols="40" rows="6"></textarea>
							</div>
						</div>

					</div>
				</div>

			</div>
		</div>
		<!-- 			</section> -->
	</div>
	<div class="container-fluid px-4">
		<div class="col">
			<div class="card mb-4">
				<div class="card-header">
					<i class="fas fa-tachometer-alt"></i> 설비점검목록
				</div>

				<div class="card-body">

					<div class="row">
						<div class="col" style="margin-bottom: 5px">
							<label for="">점검일자</label> <input type="date" id="" name="">&nbsp;
							- &nbsp;<input type="date" id="" name="">

						<div style="margin-top:5px">
							<label for="" autofocus="autofocus">설비명</label> <input
								type="text" readonly="readonly" id="" name="">
							<button class="c_btn" form="">조회</button>
						</div>
					</div>
					<div class="col">
						<div class="linelist">
							<button class="c_btn" form="">등록</button>
							<button class="c_btn" form="">수정</button>
							<button class="c_btn" form="">삭제</button>
							<button class="c_btn" form="">취소</button>
						</div>
					</div>


					<div id="grid"></div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<!-- 			</section> -->


	<!-- 		<section id="r_section"> -->



	<br>

	<script>
	const gridData = [];
	(function() {
		for (let i = 0; i < 120; i += 1) {
			gridData.push({
				c1 : 'User' + (i + 1),
				c2 : ((i + 5) % 8) * 100 + i,
				c3 : ((i + 3) % 7) * 60,
				c4 : ((i + 3) % 7) * 60,
				c5 : ((i + 3) % 7) * 60,
				c6 : ((i + 3) % 7) * 60,
				c7 : ((i + 3) % 7) * 60,
				c8 : ((i + 3) % 7) * 60,

			});
		}
	})();

	const grid = new tui.Grid({
		el : document.getElementById('grid'),
		data : gridData,
		scrollX : false,
		bodyHeight : 300,
		rowHeaders : [ 'rowNum' ],
		columns : [ {
			header : '설비코드',
			name : 'c1',
			align : 'center',
		}, {
			header : '설비명',
			name : 'c2',
			align : 'center'
		}, {
			header : '점검일자',
			name : 'c3',
			align : 'center'
		}, {
			header : '차기점검일',
			name : 'c4',
			align : 'center'
		}, {
			header : '판정',
			name : 'c5',
			align : 'center'
		}, {
			header : '가동여부',
			name : 'c6',
			align : 'center'
		}
		, {
			header : '조치사항',
			name : 'c7',
			align : 'center'
		}
		, {
			header : '조치내역',
			name : 'c8',
			align : 'center'
		}]
	});

	</script>
</body>

</html>