.class public TestCheck
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;

;
; Runtime input scanner
;
.method static <clinit>()V

	new	java/util/Scanner
	dup
	getstatic	java/lang/System/in Ljava/io/InputStream;
	invokespecial	java/util/Scanner/<init>(Ljava/io/InputStream;)V
	putstatic	TestCheck/_sysin Ljava/util/Scanner;
	return

.limit locals 0
.limit stack 3
.end method

;
; Main class constructor
;
.method public <init>()V
.var 0 is this LTestCheck;

	aload_0
	invokespecial	java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

;
; FUNCTION max
;
.method private static max(III)I

.var 0 is x I
.var 1 is y I
.var 2 is z I
;
; 004 if(x>y){if(x>z){returnx;}else{returnz;}}else{if(y>z){returny;}else{r ...
;
	iload_0
	iload_1
	if_icmpgt	L003
	iconst_0
	goto	L004
L003:
	iconst_1
L004:
	ifeq	L002
;
; 005 if(x>z){returnx;}else{returnz;}
;
	iload_0
	iload_2
	if_icmpgt	L007
	iconst_0
	goto	L008
L007:
	iconst_1
L008:
	ifeq	L006
;
; 006 returnx;
;
	iload_0
	goto	L005
L006:
;
; 009 returnz;
;
	iload_2
L005:
	goto	L001
L002:
;
; 013 if(y>z){returny;}else{returnz;}
;
	iload_1
	iload_2
	if_icmpgt	L011
	iconst_0
	goto	L012
L011:
	iconst_1
L012:
	ifeq	L010
;
; 014 returny;
;
	iload_1
	goto	L009
L010:
;
; 017 returnz;
;
	iload_2
L009:
L001:

	istore_3
	iload_3
	ireturn

.limit locals 4
.limit stack 15
.end method

;
; FUNCTION printmyname
;
.method private static printmyname(Ljava/lang/String;)V

.var 0 is name Ljava/lang/String;
;
; 023 print("Name is: %s\n",name);
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Name is: %s\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	aload_0
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	return

.limit locals 2
.limit stack 15
.end method

;
; FUNCTION output
;
.method private static output()V

;
; 027 printmyname("rahulg");
;
	ldc	"rahulg"
	invokestatic	TestCheck/printmyname(Ljava/lang/String;)V
;
; 028 print("printing something...");
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"printing something..."
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

	return

.limit locals 1
.limit stack 15
.end method

;
; FUNCTION makestring
;
.method private static makestring()Ljava/lang/String;

;
; 032 return"hello, there";
;
	ldc	"hello, there"

	astore_0
	aload_0
	areturn

.limit locals 1
.limit stack 15
.end method

;
; FUNCTION getchar
;
.method private static getchar(C)C

.var 0 is ch C
;
; 036 switch(ch){case'a':return'a';break;case'd':return'd';break;default:r ...
;
	iload_0
	lookupswitch
	  97: L013
	  100: L014
	  default: L015
L014:
;
; 042 return'd';
;
	bipush	100
	goto	L016
L013:
;
; 039 return'a';
;
	bipush	97
	goto	L016
L015:
;
; 045 return'b';
;
	bipush	98
L016:

	istore_1
	iload_1
	ireturn

.limit locals 2
.limit stack 15
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
; 052 print("Max Value is: %d\n",max(2,4,3));
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Max Value is: %d\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	iconst_2
	iconst_4
	iconst_3
	invokestatic	TestCheck/max(III)I
	invokestatic	java/lang/Integer/valueOf(I)Ljava/lang/Integer;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 053 printmyname("FreeAssange");
;
	ldc	"FreeAssange"
	invokestatic	TestCheck/printmyname(Ljava/lang/String;)V
;
; 054 print("Char is: %c\n",getchar('c'));
;
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"Char is: %c\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	bipush	99
	invokestatic	TestCheck/getchar(C)C
	invokestatic	java/lang/Character/valueOf(C)Ljava/lang/Character;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop
;
; 055 output();
;
	invokestatic	TestCheck/output()V

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

.limit locals 10
.limit stack 15
.end method
