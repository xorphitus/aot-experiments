# 実行について

AOT しないでフィボナッチしてみる

```
$ cd simple-non-aot
$ lein run
```

AOT してフィボナッチしてみる

```
$ cd simple-aot
$ lein uberjar
$ java -jar target/simple-aot-0.1.0-SNAPSHOT-standalone.jar
```

ちなみに drip で実行する場合は

```
$ drip -jar target/simple-aot-0.1.0-SNAPSHOT-standalone.jar
```

direct linking バージョンの場合は

```
$ cd direct-linking
$ lein uberjar
$ drip -jar target/direct-linking-0.1.0-SNAPSHOT-standalone.jar
```

ただ、ぶっちゃけ規模が小さすぎて direct linking のご利益がない

direct linking の有無による Java バイトコードの違いを見てみる

以下、`lein uberjar`後に行うこと

```
$ javap simple-aot.target.classes.simple_aot.core\$_main
$ javap direct-linking.target.classes.direct_linking.core\$_main
```

何やら`Var`が減ってるのが分かる

(という、非常に雑な結論が出たところで中断)
