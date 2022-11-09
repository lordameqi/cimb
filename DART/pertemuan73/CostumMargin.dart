class CostumMargin{
  double? top;
  double? bottom;
  double? left;
  double? right;

  CostumMargin(this.top, this.bottom, this.left, this.right);

  CostumMargin.only({
    this.top = 0.0,
    this.bottom = 0.0,
    this.left = 0.0,
    this.right = 0.0
});

  CostumMargin.all(double value){
    this.top = value;
    this.right = value;
    this.left = value;
    this.bottom = value;
  }
}


void main(){
  var a = CostumMargin(10.5, 12, 13, 13);
  print('#' * 50);
  print('top: ${a.top}, Bottom : ${a.bottom}, left: ${a.left}, right: ${a.right}');

  print('#' * 50);
  var b = CostumMargin.only(top: 14.78, left: 15);
  print('top: ${b.top}, Bottom : ${b.bottom}, left: ${b.left}, right: ${b.right}');

  print('#' * 50);
  var c = CostumMargin.all(12.5);
  print('top: ${c.top}, Bottom : ${c.bottom}, left: ${c.left}, right: ${c.right}');
}