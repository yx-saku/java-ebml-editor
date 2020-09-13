# Usage
```java
try (EBMLEditor editor = new EBMLEditor("EBML filePath")) {

   // rootプロパティから各要素にアクセスします。
   UnsignedIntegerElement duration = editor.root.getU(Elements.Duration);
   System.out.println(duration.getValue());
    
   // 各要素の値を更新できます。
   duration.setValue(10000.0);
    
   // SimpleBlock/Block要素については、trackNumber、timecode、keyframe flag、invisible flag、discardable flagを取得・変更できます。
   BlockElement block = editor.root.getBlock(Elements.SimpleBlock);
   System.out.println(block.timecode);
   block.timecode = 2000;
    
   // 要素を生成し、新しく追加することもできます。
   DateElement dateUTC = (DateElement) Elements.createElementById(null, Elements.DateUTC);
   dateUTC.setValue(new Date());
   editor.root.getM(Elements.Info).children.add(dateUTC);
   
   // 要素の削除もできます。
   editor.root.getM(Elements.Cluster).children.remove(1);
   
   // "Elements"と何度も書くのが面倒であれば、"E"をエイリアスとして使用できます。
   editor.root.getM(E.Cluster);
   
   // outputメソッドで変更内容を出力します。
   editor.output("outputPath");
}
```

# Memory
```java
// メモリ消費を抑えるため、構造のみ読み込みます。
// 各要素のデータ部は読み込みません。
try (EBMLEditor editor = new EBMLEditor("EBML file")) {

    UnsignedIntegerElement duration = editor.root.getU(Elements.Duration);
    
    // getValue/getDataを呼び出した際にファイルからデータを読み込みます。
    // 読み込んだデータもキャッシュしません。呼び出す度にI/Oが発生します。
    System.out.pringln(duration.getValue());
    
    // setValue/setDataを使って値を設定した場合、次にgetValue/getDataを呼び出した際は設定した値を返します。I/Oは発生しません。
    // setValueを使用してgetDataを呼び出した場合、getValueを使用してsetDataを呼び出した場合も同様です。
    duration.setValue(10000.0);
    System.out.pringln(duration.getValue()); // not I/O
    System.out.pringln(duration.getData());  // not I/O
    
    // clearValueを呼び出すと、設定した値がクリアされ、再度データをファイルから読み込むようになります。
    duration.clearValue();
    System.out.pringln(duration.getValue()); // I/O
}
```