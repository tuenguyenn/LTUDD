<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Danh sách sản phẩm</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>

<body>

<div id="content_sp">
    <?php
    $conn = new PDO("mysql:host=localhost;dbname=dacntt","root","");
    $conn->query("SET NAMES UTF8");
    $sql = "SELECT * FROM tbsanpham";
    $pdo_stm = $conn->prepare($sql);
    $ketqua = $pdo_stm->execute();
    $products = $pdo_stm->fetchAll();
    
    $n = count($products);
    for($i=0; $i<$n;$i++)
    {
        $ten=$products[$i]["ten"];
        $anhsp = $products[$i]["anhsp"];
        $giasp = $products[$i]["giasp"]
    ?>
    <div class="sanpham">
        <h3><?=$ten?></h3>
        <p class="anhsanpham"><img src="Hinhanh/<?=$anhsp?>"></p>
        <p>Giá: <?=$giasp?> VNĐ</p>
    </div>
    <?php
    }
    ?>
</div>    
</body>
</html>
