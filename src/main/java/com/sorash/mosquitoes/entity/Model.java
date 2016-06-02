/*// Date: 6/1/2016 11:35:14 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelModel extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer sting;
    ModelRenderer leg1.1;
    ModelRenderer leg1.2;
    ModelRenderer leg2.1;
    ModelRenderer leg2.2;
    ModelRenderer leg3.1;
    ModelRenderer leg3.2;
  
  public ModelModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(0F, 0F, 0F, 4, 4, 4);
      head.setRotationPoint(-2F, 11F, -11F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0.5235988F, 0F, 0F);
      body1 = new ModelRenderer(this, 0, 0);
      body1.addBox(0F, 0F, 0F, 6, 6, 8);
      body1.setRotationPoint(-3F, 8.5F, -8.5F);
      body1.setTextureSize(64, 32);
      body1.mirror = true;
      setRotation(body1, 0.5235988F, 0F, 0F);
      body2 = new ModelRenderer(this, 0, 0);
      body2.addBox(0F, -1F, 1F, 6, 6, 15);
      body2.setRotationPoint(-3F, 4.7F, -3F);
      body2.setTextureSize(64, 32);
      body2.mirror = true;
      setRotation(body2, -0.6632251F, 0F, 0F);
      sting = new ModelRenderer(this, 0, 0);
      sting.addBox(0F, 0F, 0F, 2, 7, 2);
      sting.setRotationPoint(-1F, 11.26667F, -10F);
      sting.setTextureSize(64, 32);
      sting.mirror = true;
      setRotation(sting, -0.4363323F, 0F, 0F);
      leg1.1 = new ModelRenderer(this, 0, 0);
      leg1.1.addBox(0F, 0F, 0F, 4, 1, 1);
      leg1.1.setRotationPoint(2F, 12.5F, -5.5F);
      leg1.1.setTextureSize(64, 32);
      leg1.1.mirror = true;
      setRotation(leg1.1, 0F, 0F, -0.7853982F);
      leg1.2.mirror = true;
      leg1.2 = new ModelRenderer(this, 0, 0);
      leg1.2.addBox(0F, 0F, 0F, 10, 1, 1);
      leg1.2.setRotationPoint(5F, 9.5F, -5.5F);
      leg1.2.setTextureSize(64, 32);
      leg1.2.mirror = true;
      setRotation(leg1.2, 0F, 0F, 0.7853982F);
      leg1.2.mirror = false;
      leg2.1 = new ModelRenderer(this, 0, 0);
      leg2.1.addBox(0F, 0F, 0F, 4, 1, 1);
      leg2.1.setRotationPoint(2F, 11F, -4F);
      leg2.1.setTextureSize(64, 32);
      leg2.1.mirror = true;
      setRotation(leg2.1, 0F, 0F, -0.7853982F);
      leg2.2 = new ModelRenderer(this, 0, 0);
      leg2.2.addBox(0F, 0F, 0F, 10, 1, 1);
      leg2.2.setRotationPoint(5F, 8F, -4F);
      leg2.2.setTextureSize(64, 32);
      leg2.2.mirror = true;
      setRotation(leg2.2, 0F, 0F, 0.7853982F);
      leg3.1 = new ModelRenderer(this, 0, 0);
      leg3.1.addBox(0F, 0F, 0F, 4, 1, 1);
      leg3.1.setRotationPoint(2F, 10F, -2.5F);
      leg3.1.setTextureSize(64, 32);
      leg3.1.mirror = true;
      setRotation(leg3.1, 0F, 0F, -0.7853982F);
      leg3.2 = new ModelRenderer(this, 0, 0);
      leg3.2.addBox(0F, 0F, 0F, 10, 1, 1);
      leg3.2.setRotationPoint(5F, 7F, -2.5F);
      leg3.2.setTextureSize(64, 32);
      leg3.2.mirror = true;
      setRotation(leg3.2, 0F, 0F, 0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body1.render(f5);
    body2.render(f5);
    sting.render(f5);
    leg1.1.render(f5);
    leg1.2.render(f5);
    leg2.1.render(f5);
    leg2.2.render(f5);
    leg3.1.render(f5);
    leg3.2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
*/