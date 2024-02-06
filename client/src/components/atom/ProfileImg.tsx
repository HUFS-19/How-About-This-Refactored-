import { FC } from 'react';
import styled from 'styled-components';
import defaultImg from '../../assets/default.png';

interface ProfileImgProps {
  src?: string;
  width?: string;
  style?: object;
}

const ProfileIcon: FC<ProfileImgProps> = ({
  src = defaultImg,
  width,
  style,
}) => {
  return <StyledProfileImg src={src} width={width} style={style} />;
};

export const StyledProfileImg = styled.img`
  width: ${(props) => props.width || '100px'};
  height: ${(props) => props.width || '100px'};
  border-radius: 50%;
`;

export default ProfileIcon;
