.class public Test
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;
.field private static x I

;
; Runtime input scanner
;
.method static <clinit>()V

	new	java/util/Scanner
	dup
	getstatic	java/lang/System/in Ljava/io/InputStream;
	invokespecial	java/util/Scanner/<init>(Ljava/io/InputStream;)V
	putstatic	Test/_sysin Ljava/util/Scanner;
	return

.limit locals 0
.limit stack 3
.end method

;
; Main class constructor
;
.method public <init>()V
.var 0 is this LTest;

	aload_0
	invokespecial	java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

;
; MAIN
;
.method public static main([Ljava/lang/String;)V
.var 0 is args [Ljava/lang/String;
.var 1 is _start Ljava/time/Instant;
.var 2 is _end Ljava/time/Instant;
.var 3 is _elapsed J

	invokestatic	java/time/Instant/now()Ljava/time/Instant;
	astore_1

;
; 005 intx=13;
;
	bipush	13
	putstatic	Test/x I
;
; 006 switch(x){case10:print("hello %d \n",x);break;case3,4,5:print("2");b ...
;
	getstatic	Test/x I
	lookupswitch
	  3: L002
	  4: L002
	  5: L002
	  10: L001
	  default: L003
L002:
;
; 012 print("2");
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"2"
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V
	goto	L004
L001:
;
; 008 print("hello %d \n",x);
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"hello %d \n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	getstatic	Test/x I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
	goto	L004
L003:
;
; 016 print("default");
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"default"
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V
L004:

	invokestatic	java/time/Instant/now()Ljava/time/Instant;
	astore_2
	aload_1
	aload_2
	invokestatic	java/time/Duration/between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
	invokevirtual	java/time/Duration/toMillis()J
	lstore_3
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"\n[%,d milliseconds execution time.]\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	lload_3
	invokestatic	java/lang/Long/valueOf(J)Ljava/lang/Long;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	return

.limit locals 6
.limit stack 15
.end method
