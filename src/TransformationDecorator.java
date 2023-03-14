public class TransformationDecorator extends ShapeDecorator{
    private boolean translate;
    private Vec2 translateVector;
    public TransformationDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public String toSvg(String parameters){
        String result = "";

        if(this.translate){
            result += "...";//trzeba to dokończyć!!!
        }
        return result;
    }

    public static class Builder{
        private boolean translate = false;
        private Vec2 translateVector;

        public Builder setTranslateVector(Vec2 translateVector) {
            this.translate = true;
            this.translateVector = translateVector;
            return this;
        }
        public TransformationDecorator build(Shape shape){
            TransformationDecorator result = new TransformationDecorator();
            if(this.translate){
                result.translateVector = this.translateVector;
                result.translate = this.translate;
            }
            return result;
        }
    }

}
