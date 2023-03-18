package com.bdg.h9_enum.exercise_6;

//public enum ShapeType {
//    SQUARE {
//        private Shape square;
//
//        @Override
//        public void setShape(Shape shape) {
//            if (shape instanceof Square) {
//                square = shape;
//            }
//        }
//
//        @Override
//        public Shape getShape() {
//            return square;
//        }
//    }, CIRCLE {
//        private Shape circle;
//
//        @Override
//        public void setShape(Shape shape) {
//            if (shape instanceof Circle) {
//                circle = shape;
//            }
//        }
//
//        @Override
//        public Shape getShape() {
//            return circle;
//        }
//    }, RECTANGLE {
//        private Shape rectangle;
//
//        @Override
//        public void setShape(Shape shape) {
//            if (shape instanceof Rectangle) {
//                rectangle = shape;
//            }
//        }
//
//        @Override
//        public Shape getShape() {
//            return rectangle;
//        }
//    };
//
//    public abstract void setShape(Shape shape);
//
//    public abstract Shape getShape();
//}


enum ShapeType {

    CIRCLE(new Circle()),
    SQUARE(new Square()),
    RECTANGLE(new Rectangle());


    private Shape shape;

    ShapeType(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}